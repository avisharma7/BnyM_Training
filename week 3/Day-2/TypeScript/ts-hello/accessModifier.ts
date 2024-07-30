class car {
  private brand: string;
  protected model: string;
  public year: number;

  constructor(brand: string, model: string, year: number) {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }

  public getCarInfo(): string {
    return `${this.brand} ${this.model} ${this.year}`;
  }
  public updateModel(newModel: string): void {
    this.model = newModel;
  }
}

//creating and using instances
const myCar = new car("Toyotal", "Corolla", 2020);
console.log(myCar.getCarInfo());
//console.log(myCar.brand());
myCar.updateModel("Camry");
