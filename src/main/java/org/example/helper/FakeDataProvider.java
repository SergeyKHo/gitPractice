package org.example.helper;

import com.github.javafaker.Faker;
import org.example.models.Student;




public class FakeDataProvider {
    Faker faker = new Faker();

    public String generateFakeFullName() {
        return faker.name().fullName();
    }
    public String generateFirstName() {
        return faker.name().firstName();
    }
    public String generateLastName() {
        return faker.name().lastName();
    }

    public String generateFakeEmail() {
        return faker.internet().emailAddress();
    }
    public String generateAge(){
        return faker.number().digits(2);
    }
public String generatePhoneNumber(){
    return faker.phoneNumber().cellPhone();
}

    public String generateFakeCurrentAddress() {
        return faker.address().fullAddress();
    }

    public String generateFakePermanentAddress() {
        return faker.address().streetName() + " " + faker.address().streetAddressNumber();
    }
    public String generateFakeUsername(){
        return faker.name().username();
    }
public String generateFakeSalary(){
        return faker.number().digits(4);
}
public String generateFakeDepartment(){
        return faker.commerce().department();
}

public Student createFakeStudent(){
        Student student =new Student();
        student.setFirstName(generateFirstName());
        student.setLastName(generateLastName());
        student.setEmail(generateFakeEmail());
        student.setCurrentAddress(generateFakeCurrentAddress());
        student.setAge(generateAge());
        student.setUserName(generateFakeUsername());
         student.setSalary(generateFakeSalary());
         student.setDepartment(generateFakeDepartment());
        return student;

    }
    }







