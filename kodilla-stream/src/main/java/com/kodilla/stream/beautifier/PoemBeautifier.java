package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String decorateText, PoemDecorator poemDecorator){
        return poemDecorator.decorate(decorateText);
    }
}
