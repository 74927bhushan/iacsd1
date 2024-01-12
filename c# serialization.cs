using System;
using System.IO;
using System.Runtime.Serialization.Json;

[Serializable]
public class Person
{
    public string Name { get; set; }
    public int Age { get; set; }
}

class Program
{
    static void Main()
    {
        // Create an instance of the Person class
        Person person = new Person
        {
            Name = "John Doe",
            Age = 30
        };

        // Serialize the object to JSON
        string json = SerializeToJson(person);

        Console.WriteLine("Serialized JSON:");
        Console.WriteLine(json);

        // Deserialize the JSON back to an object
        Person deserializedPerson = DeserializeFromJson<Person>(json);

        Console.WriteLine("\nDeserialized Object:");
        Console.WriteLine($"Name: {deserializedPerson.Name}, Age: {deserializedPerson.Age}");
    }

    static string SerializeToJson<T>(T obj)
    {
        using (MemoryStream stream = new MemoryStream())
        {
            DataContractJsonSerializer serializer = new DataContractJsonSerializer(typeof(T));
            serializer.WriteObject(stream, obj);
            stream.Position = 0;
            using (StreamReader reader = new StreamReader(stream))
            {
                return reader.ReadToEnd();
            }
        }
    }

    static T DeserializeFromJson<T>(string json)
    {
        using (MemoryStream stream = new MemoryStream(System.Text.Encoding.UTF8.GetBytes(json)))
        {
            DataContractJsonSerializer serializer = new DataContractJsonSerializer(typeof(T));
            return (T)serializer.ReadObject(stream);
        }
    }
}
