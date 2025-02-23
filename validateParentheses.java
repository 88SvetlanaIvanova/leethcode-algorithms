public boolean isValid(String s) {
          ArrayDeque<String> parenthesis = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '{' || currentChar == '[' || currentChar == '(') {
                parenthesis.push(String.valueOf(currentChar));
            } else if (currentChar == '}' || currentChar == ']' || currentChar == ')') {
                if (parenthesis.isEmpty()) {
                    return false;
                }
                String openingBracket = parenthesis.pop();
                if ((currentChar == '}' && !openingBracket.equals("{")) ||
                        (currentChar == ']' && !openingBracket.equals("[")) ||
                        (currentChar == ')' && !openingBracket.equals("("))) {
                    return false;
                }
            }
        }
        return parenthesis.isEmpty();
    }
