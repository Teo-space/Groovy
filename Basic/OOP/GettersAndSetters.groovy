class Human
{
    private int HumanAge;

    int getAge(){
        return this.HumanAge;
    }
    void setAge(int pAge){
        this.HumanAge=pAge;
    }
}


println "Start"

Human human = new Human();
human.setAge(15);
println human.Age;////private?)     ¯\_(ツ)_/¯
println human.getAge();




