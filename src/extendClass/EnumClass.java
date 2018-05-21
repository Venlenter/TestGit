package extendClass;

public class EnumClass {
    public enum Size {
        SMALL("S"),
        MEDIUM("M"),
        LARGE("L"),
        EXTRA_LARGE("XL");

        private String abbReviation;

        Size(String abbReviation) {
            this.abbReviation = abbReviation;
        }

        public String getAbbReviation() {
            return abbReviation;
        }
    }
}
