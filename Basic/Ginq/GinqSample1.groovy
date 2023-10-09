import groovy.json.JsonSlurper

def json = new JsonSlurper().parseText '''
    {
        "people": [
            {"name": "Alan", "age": 11},
            {"name": "Mary", "age": 26},
            {"name": "Eric", "age": 34},
            {"name": "Elisabeth", "age": 14},
            {"name": "Marc", "age": 2},
            {"name": "Robert", "age": 52},
            {"name": "Veronica", "age": 32},
            {"name": "Alex", "age": 17}
        ]
    }
    '''

def result = GQ {
    from f in json.people
    where f.age >= 18
    orderby f.age in desc
    limit 3
    select f.name

}.toList();
println result;

