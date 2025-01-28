package com.functionality_for_text_editor;

//TextEditorUndoRedo is controller class for text editor
public class TextEditorUndoRedo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10); // Limit history to 10 states

        editor.addTextState("Hello");
        editor.displayCurrentState();

        editor.addTextState("Hello, World");
        editor.displayCurrentState();

        editor.addTextState("Hello, World!");
        editor.displayCurrentState();

        System.out.println("Performing Undo...");
        editor.undo();
        editor.displayCurrentState();

        System.out.println("Performing Redo...");
        editor.redo();
        editor.displayCurrentState();
    }
}
