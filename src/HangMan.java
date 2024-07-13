public enum HangMan {
    ZERO {
        @Override
        public String toString() {
            return "--------\n|\n|\n|\n|\n|\n|\n---------------";
        }
    },
    ONE {
        @Override
        public String toString() {
            return "--------\n|      | \n|\n|\n|\n|\n|\n---------------";
        }
    },
    TWO {
        @Override
        public String toString() {
            return "--------\n|      | \n|    (-_-)\n|\n|\n|\n|\n---------------";
        }
    },
    THREE {
        @Override
        public String toString() {
            return "--------\n|      | \n|    (-_-)\n|      | \n|\n|\n|\n---------------";
        }
    },
    FOUR {
        @Override
        public String toString() {
            return "--------\n|      | \n|    (-_-)\n|     /| \n|\n|\n|\n---------------";
        }
    },
    FIVE {
        @Override
        public String toString() {
            return "--------\n|      | \n|    (-_-)\n|     /|\\ \n|\n|\n|\n---------------";
        }
    },
    SIX {
        @Override
        public String toString() {
            return "--------\n|      | \n|    (-_-)\n|     /|\\ \n|     / \\\n|\n|\n---------------";
        }
    },
}
