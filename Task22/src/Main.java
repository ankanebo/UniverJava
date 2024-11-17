public class Main {
    public static void main(String[] args) {
        Stack st = new Stack(10);
        st.getExample("23*45*+");
        st.getExample("1267-/*");
        st.getExample("43687");
        st.getExample("hjkfd");
        st.getExample("234+++");
        st.getExample("234+-123*+/");
        st.getExample("23+4-");
        st.getExample("23+45-");
        st.getExample("23?56?-");
        st.getExample("23$89^+");
    }
}