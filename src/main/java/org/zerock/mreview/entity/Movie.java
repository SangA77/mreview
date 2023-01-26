package org.zerock.mreview.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// 영화 제목만을 가지는 구조
// M:N 관계를 처리할 때는 반드시 맵핑 테이블의 설계는 마지막 단계에서 처리하고 '명사'에 해당하는 클래스를 먼저 설계
//        -> 영화(Movie)와 회원(Member)의 존재가 명사에 해당이므로 먼저 설계
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Movie extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;

    private String title;


}
