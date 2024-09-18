package com.workconnect.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "comments_group")
public class CommentsGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(name = "posted_date")
    private LocalDateTime postedDate;

    @Column(name = "likes_count")
    private Integer likesCount;

    @ManyToOne
    @JoinColumn(name = "member_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "FK_comments_member"))
    private Members member;
}

