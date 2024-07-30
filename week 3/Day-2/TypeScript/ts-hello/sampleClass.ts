class Person {
  //properties
  firstName: string;
  lastName: string;
  age: number;

  //constructor
  constructor(firstName: string, lastName: string, age: number) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  //methods
  getFullName(): string {
    return `${this.firstName} ${this.lastName}`;
  }

  //methods with parament
  celebrateBirthday(years: number): void {
    this.age += years;
  }
}

//creating an object
const person1 = new Person("Aviral", "Sharma", 23);
console.log(person1.getFullName());
console.log(person1.age);

person1.celebrateBirthday(1);
console.log(person1.age);
