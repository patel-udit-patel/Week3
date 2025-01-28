package com.functionality_for_text_editor;

//TextState is a node class for List of States
class TextState {
    String content;
    TextState prev, next;

    public TextState(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
