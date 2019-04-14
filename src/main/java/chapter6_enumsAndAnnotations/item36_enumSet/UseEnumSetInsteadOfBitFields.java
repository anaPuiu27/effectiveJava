package chapter6_enumsAndAnnotations.item36_enumSet;

import java.util.EnumSet;
import java.util.Set;

public class UseEnumSetInsteadOfBitFields {

    public static void main(String[] args) {

        //just because an enumerated type will be used in sets, there is no reason to represent it with bit fields

        //lets you use the bitwise OR operation to combine several constants into a set, known as a bit field
        Text text = new Text();
        text.applyStyles(Text.STYLE_BOLD | Text.STYLE_ITALIC);

        text.applyStyles(EnumSet.of(Text.Style.BOLD, Text.Style.ITALIC));
    }

    // Bit field enumeration constants - OBSOLETE!
    public static class Text {

        public static final int STYLE_BOLD = 1 << 0; // 1
        public static final int STYLE_ITALIC = 1 << 1; // 2
        public static final int STYLE_UNDERLINE = 1 << 2; // 4
        public static final int STYLE_STRIKETHROUGH = 1 << 3; // 8

        // Parameter is bitwise OR of zero or more STYLE_ constants
        public void applyStyles(int styles) { /* ... */ }


        public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}

        // Any Set could be passed in, but EnumSet is clearly best
        public void applyStyles(Set<Style> styles) { /* ... */ }


    }


}
