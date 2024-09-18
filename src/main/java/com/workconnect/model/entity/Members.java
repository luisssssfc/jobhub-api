package com.workconnect.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "members")
public class Members {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "fk_members_user"))
    private User user;

    @ManyToOne
    @JoinColumn(name = "community_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "fk_members_community"))
    private Community community;

    @Column(name = "is_admin")
    private Boolean isAdmin;

    @Column(name = "join_date")
    private LocalDateTime joinDate;
}
