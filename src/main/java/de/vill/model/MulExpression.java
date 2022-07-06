package de.vill.model;

public class MulExpression extends Expression {
    private Expression left;
    private Expression right;

    public MulExpression(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append(left.toString());
        result.append(" * ");
        result.append(right.toString());
        return result.toString();
    }
}