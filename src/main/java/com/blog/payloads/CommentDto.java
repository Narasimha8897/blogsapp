package com.blog.payloads;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CommentDto {

	private int id;
	private String content;
	private String addedname;
	private int commentedId;
	private UserDto user;
}
