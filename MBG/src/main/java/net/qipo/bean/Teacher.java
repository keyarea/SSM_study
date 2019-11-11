package net.qipo.bean;

import java.util.Date;

public class Teacher {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_teacher.id
     *
     * @mbg.generated Mon Nov 11 19:18:59 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_teacher.teacherName
     *
     * @mbg.generated Mon Nov 11 19:18:59 CST 2019
     */
    private String teachername;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_teacher.class_name
     *
     * @mbg.generated Mon Nov 11 19:18:59 CST 2019
     */
    private String className;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_teacher.address
     *
     * @mbg.generated Mon Nov 11 19:18:59 CST 2019
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_teacher.birth_date
     *
     * @mbg.generated Mon Nov 11 19:18:59 CST 2019
     */
    private Date birthDate;


    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", teachername='" + teachername + '\'' +
                ", className='" + className + '\'' +
                ", address='" + address + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_teacher.id
     *
     * @return the value of t_teacher.id
     *
     * @mbg.generated Mon Nov 11 19:18:59 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_teacher.id
     *
     * @param id the value for t_teacher.id
     *
     * @mbg.generated Mon Nov 11 19:18:59 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_teacher.teacherName
     *
     * @return the value of t_teacher.teacherName
     *
     * @mbg.generated Mon Nov 11 19:18:59 CST 2019
     */
    public String getTeachername() {
        return teachername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_teacher.teacherName
     *
     * @param teachername the value for t_teacher.teacherName
     *
     * @mbg.generated Mon Nov 11 19:18:59 CST 2019
     */
    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_teacher.class_name
     *
     * @return the value of t_teacher.class_name
     *
     * @mbg.generated Mon Nov 11 19:18:59 CST 2019
     */
    public String getClassName() {
        return className;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_teacher.class_name
     *
     * @param className the value for t_teacher.class_name
     *
     * @mbg.generated Mon Nov 11 19:18:59 CST 2019
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_teacher.address
     *
     * @return the value of t_teacher.address
     *
     * @mbg.generated Mon Nov 11 19:18:59 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_teacher.address
     *
     * @param address the value for t_teacher.address
     *
     * @mbg.generated Mon Nov 11 19:18:59 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_teacher.birth_date
     *
     * @return the value of t_teacher.birth_date
     *
     * @mbg.generated Mon Nov 11 19:18:59 CST 2019
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_teacher.birth_date
     *
     * @param birthDate the value for t_teacher.birth_date
     *
     * @mbg.generated Mon Nov 11 19:18:59 CST 2019
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}