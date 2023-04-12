package sec08.exam04;

public class Person {
    final String nation = "Korea";
    final String ssn; //주민등록 번호
    String name;


    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
