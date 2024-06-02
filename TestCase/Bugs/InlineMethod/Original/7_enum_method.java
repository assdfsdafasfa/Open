enum InlineMethodTest {
    RED {
        public String getAction() {
            return "Stop";
        }
    },
    GREEN {
        public String getAction() {
            return "Go";
        }
    },
    YELLOW {
        public String getAction() {
            return "Proceed with caution";
        }
    };
    public abstract String getAction();
}