package bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 实体类
 * @author User
 */
@Data
public class Person implements Serializable {

    private static final long serialVersionUID = -7969719491548482668L;
    private int age;
    private String name;

}
