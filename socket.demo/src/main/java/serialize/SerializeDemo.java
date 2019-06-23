package serialize;

import bean.Person;

import java.io.*;

/**
 * 简单的序列化demo
 * @author User
 */
public class SerializeDemo {

    public static void main(String[] args) {

        //序列化
        serializeMethod();

        //反序列化
        deSerializeMethod();
    }

    /**
     * 序列化方法
     */
    private static void serializeMethod() {

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(new File("person")));

            Person person = new Person();
            person.setAge(18);
            person.setName("jack");

            outputStream.writeObject(person);
            outputStream.flush();
            outputStream.close();

            System.out.println("序列化成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 反序列化方法
     */
    private static void deSerializeMethod() {

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("person")));

            Person person = (Person)inputStream.readObject();

            System.out.println("反序列化成功-----");
            System.out.println(person);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
