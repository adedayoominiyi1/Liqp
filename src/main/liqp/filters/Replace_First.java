package liqp.filters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Replace_First extends Filter {

    @Override
    public Object apply(Object value, Object... params) {

        String original = String.valueOf(value);

        String needle = String.valueOf(super.get(0, params));
        String replacement = String.valueOf(super.get(1, params));

        return original.replaceFirst(Pattern.quote(needle), Matcher.quoteReplacement(replacement));
    }
}