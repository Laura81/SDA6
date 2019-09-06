package designpattern.structuraldecorator;

public class RedLights extends TreeDecorator {

    public RedLights(ChristmasTree decoratedChristmasTree) {
        super(decoratedChristmasTree);
    }

    @Override
    public String decorate(){
        return decoratedChristmasTree.decorate() + setRedLights();
    }

    private String setRedLights(){
        return " cu luminite rosii";
    }
}
