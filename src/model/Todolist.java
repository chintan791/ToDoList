package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the TODOLIST database table.
 * 
 */
@Entity
@NamedQuery(name="Todolist.findAll", query="SELECT t FROM Todolist t")
public class Todolist implements Serializable {
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Id
	private long todoid;
	

	@Temporal(TemporalType.DATE)
	private Date datecompleted;

	private String description;

	@Temporal(TemporalType.DATE)
	private Date duedate;

	private String priority;

	private String task;

	//bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name="STATUSID")
	private Status status;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USERID")
	private User user;

	public Todolist() {
	}

	public long getTodoid() {
		return this.todoid;
	}

	public void setTodoid(long todoid) {
		this.todoid = todoid;
	}

	public Date getDatecompleted() {
		return this.datecompleted;
	}

	public void setDatecompleted(Date datecompleted) {
		this.datecompleted = datecompleted;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDuedate() {
		return this.duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getTask() {
		return this.task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}