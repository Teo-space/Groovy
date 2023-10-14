record SensorData(String SensorName, Date At, Double Value) { }
List<SensorData> Datas = new ArrayList<SensorData>();

println "ArrayList Methods:"
println Datas.class.methods.collect { it.name }
println "stream Methods:"
println Datas.stream().class.methods.collect { it.name }



