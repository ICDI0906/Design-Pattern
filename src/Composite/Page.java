package Composite;

public class Page extends PageComposite{
	private String pageContent;
	public Page(String page) {
//		this.setPageContent(page);
		this.pageContent = page;
	}
	public String getPageContent() {
		return pageContent;
	}
	public void setPageContent(String pageContent) {
		this.pageContent = pageContent;
	}
	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println(pageContent);
	}
}
