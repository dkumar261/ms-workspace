/**
 * 
 */
package com.practice.ms.webservice.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Dinesh Kumar
 *
 */

@Getter
@Setter
@Entity
@Table(name = "GREETING")
public class Greeting {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String message;
	private String brand;
	private Date createDate;
	@Column(name = "ITEM_TYPE")
	private Integer type;

}