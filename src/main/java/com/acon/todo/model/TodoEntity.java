package com.acon.todo.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Todo")
public class TodoEntity {

    @Id // 기본 키가 될 필드
    @GeneratedValue(generator = "system-uuid") // Id를 자동으로 생성
    @GenericGenerator(name = "system-uuid", strategy = "uuid") // 어떤 방식으로 Id를 생성할지 지정
    private String id;
    private String userId;
    private String title;
    private boolean done;

}
