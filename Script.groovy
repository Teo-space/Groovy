import groovy.json.JsonSlurper 
import groovy.json.JsonOutput
import groovy.json.JsonOutput.*



record Person(long Id, String Name, int Age){}

Person person = new Person(0, "John", 25)
def output = JsonOutput.toJson(person)
//println(output);  
//def prettyPrint = JsonOutput.prettyPrint(output)
//println(prettyPrint);

def jsonSlurper = new JsonSlurper()

def object = jsonSlurper.parseText(output) 
println(object.class);
println(object);
println(object.Id);
println(object.Name);


Person personFromJson = jsonSlurper.parseText(output) 
println(personFromJson.class);
println(personFromJson);
println(personFromJson.Id);
println(personFromJson.Name);
