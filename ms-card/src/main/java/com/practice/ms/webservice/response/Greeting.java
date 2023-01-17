/**
 * 
 */
package com.practice.ms.webservice.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Dinesh Kumar
 *
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Greeting {

	private String message;
	private Date createDate;
	private String cardId;

}