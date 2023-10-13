println "Start"


record SensorData(String SensorName, Date At, Double Value) { }

List<SensorData> Datas = new ArrayList<SensorData>();

def t = System.currentTimeMillis()
for(x in 0..1000000){
    Datas.add(new SensorData("S1", new Date(), Math.random()))
    Datas.add(new SensorData("S2", new Date(), Math.random()))
    Datas.add(new SensorData("S3", new Date(), Math.random()))
}
println "Fill time: ${System.currentTimeMillis()-t}"

println "CountAll: ${Datas.size()}"
println "Count: ${Datas.count { it.SensorName == "S1"}}"

t = System.currentTimeMillis()
def x = Datas
        .findAll { it.SensorName == "S1"}
        .collect { it.Value}
        .sum(0)
println "Querytime: ${System.currentTimeMillis()-t}"
println "Result: ${x}"



