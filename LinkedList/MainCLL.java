public class MainCLL {
        public static void main(String[] args) {
            CSLL circll = new CSLL(12);
            circll.insert(19);
            circll.insert(21);
            circll.insert(34);
            circll.display(); 
            circll.insertIndex(45,2);
            circll.display(); 
            circll.delete(19);
            circll.display(); 

        } 
    
}
