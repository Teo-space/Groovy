def day = 51;

int numLetters = switch (day) {
    case 0, 1, 2 -> 6;
    case 3                -> 7;
    default      -> {
      String s = day.toString();
      int result = s.length();
      yield result;
    }
};

println numLetters