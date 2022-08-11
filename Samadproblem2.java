public class Samadproblem2 {
    public static String reverse(String a){
        String az="";
        for(int i=a.length()-1;i>=0;--i){
            az=az+a.charAt(i);
        }
        return az;
    }
    public static void main(String[] args) {
        String samad="";
        String q="Samad is a good boy";
        String s=q+" ";
            String k="";
        System.out.println("Samad bhai ku hona tha so String ok-->");
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) != ' ') {
                k = k + s.charAt(i);
            }
            else if(s.charAt(i)==' '){
                if(i!=s.length()) {
                    samad =samad+ reverse(k)+' ';
                    k="";
                }
        }
        }
        for (int i=0;i<samad.length();i++) {
            System.out.print(samad.charAt(i));
        }

    }
}
