package de.vill.model;

public class NotConstraint extends Constraint{
    private Constraint content;

    public NotConstraint(Constraint content){
        this.content = content;
    }

    public Constraint getContent() {
        return content;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("!");
        result.append(content);
        return result.toString();
    }
}