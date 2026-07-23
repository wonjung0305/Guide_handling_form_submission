package com.example.gshandlingformsubmission;

public class Greeting {

    // HTML <input> 태그의 name 속성과 1:1 매핑할 필드
    private long id;
    private String content;

    // Setter로 입력값 주입
    // Getter는 Thymeleaf 템플릿에서 값을 꺼낼 때 사용
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
