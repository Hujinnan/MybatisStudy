package bean;
/**
 * ��Ϣ���Ӧ��ʵ��
 * @author xiaoz
 *
 */

public class Message {
	private int id;  //����
	private String command; 
	private String description;
	private String content;
	
	public Message() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	

	
}
