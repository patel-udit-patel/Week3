package com.functionality_for_text_editor;

//Class TextEditor is public
public class TextEditor {
    private TextState current;
    private int historyLimit;
    private int historySize;

    public TextEditor(int historyLimit) {
        this.current = null;
        this.historyLimit = historyLimit;
        this.historySize = 0;
    }

    // Adds a new text state to the doubly linked list
    public void addTextState(String newText) {
        TextState newState = new TextState(newText);
        if (current != null) {
            newState.prev = current;
            current.next = newState;
        }
        current = newState;
        historySize++;
        trimHistory(); // Ensures history size doesn't exceed limit
    }

    // Undo operation: Move to the previous state
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No more undo steps available.");
        }
    }

    // Redo operation: Move to the next state
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("No more redo steps available.");
        }
    }

    // Displays the current text state
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("No text available.");
        }
    }

    // Removes old history beyond the limit
    private void trimHistory() {
        if (historySize > historyLimit) {
            TextState temp = current;
            while (historySize > historyLimit && temp.prev != null) {
                temp = temp.prev;
                historySize--;
            }
            temp.prev = null; // Remove older states
        }
    }
}

