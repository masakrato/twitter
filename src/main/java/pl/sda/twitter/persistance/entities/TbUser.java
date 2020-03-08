package pl.sda.twitter.persistance.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_user"
//        , uniqueConstraints = {
//        @UniqueConstraint(columnNames = "US_USERNAME")}
)
public class TbUser {
    @Id
    @GeneratedValue
    @Column(name = "US_ID", unique = true, nullable = false)
    private int id;
    @Column(name = "US_USERNAME", nullable = false, unique = true, length = 25)
    private String login;
    @Column(name = "US_PASSWORD", nullable = false, length = 25)
    private String password;
}
