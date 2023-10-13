@Grab('org.mongodb:mongodb-driver:4.10')

import com.mongodb.MongoClient
import com.mongodb.DBCollection
import com.mongodb.DB
import com.mongodb.BasicDBObject
import com.mongodb.*


class MongoService { 
    private MongoClient mongoClient 

    def host = "localhost" //your host name 
    def port = 27017 //your port no. 
    def databaseName = 'test'

    public MongoClient client() {
        mongoClient = mongoClient ?: new MongoClient(host, port) 

        return mongoClient
    } 

    public DBCollection collection(collectionName) { 
        DB db = client().getDB(databaseName)

        return db.getCollection(collectionName) 
    }
}



record SensorData(String SensorName, Date At, Double Value) { }

println "Start"

def service = new MongoService(databaseName: 'db')
def DatasCollection = service.collection('Datas')
//DatasCollection.insertOne(new SensorData("S1", new Date(), Math.random()))

DBObject obj = new BasicDBObject();
obj.put( "foo", "bar" );
DatasCollection.insert(obj)

