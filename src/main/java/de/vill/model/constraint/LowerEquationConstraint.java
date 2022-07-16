package de.vill.model.constraint;

import de.vill.model.expression.Expression;

public class LowerEquationConstraint extends Constraint{
    private Expression left;
    private Expression right;

    public LowerEquationConstraint(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString(boolean withSubmodels, String currentAlias){
        StringBuilder result = new StringBuilder();
        result.append(left.toString(withSubmodels, currentAlias));
        result.append(" < ");
        result.append(right.toString(withSubmodels, currentAlias));
        return result.toString();
    }
}