package com.okkristen.blogserver.common.Result;
import org.springframework.data.domain.Pageable;

/**
 * 分页参数对象，为了适应{@code @RequestBody}中存放查询对象和分页对象
 * @author fengw
 * @create 2017年1月25日
 */
public class PageParam<P>{
	P param;
	MyPageRequest pageable;
	// 是否为待审批状态
	Boolean approval;
	
	public P getParam() {
		return param;
	}
	public void setParam(P param) {
		this.param = param;
	}
	public Pageable getPageable() {
		if (pageable != null) {
			return pageable.getPageable();
		}
		return new MyPageRequest().getPageable();
	}
	public void setPageable(MyPageRequest pageable) {
		this.pageable = pageable;
	}
	public Boolean getApproval() {
		if (approval == null)
			return false;
		return approval;
	}
	public void setApproval(Boolean approval) {
		this.approval = approval;
	}
}
