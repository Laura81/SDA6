package designpattern.structuraldecorator;

public class Topper extends TreeDecorator {
    public Topper(ChristmasTree decoratedChristmasTree) {
        super(decoratedChristmasTree);
    }

    @Override
    public String decorate(){
        return decoratedChristmasTree.decorate()+ setTopper();
    }

    private String setTopper(){
        return " cu varf";
    }
}
