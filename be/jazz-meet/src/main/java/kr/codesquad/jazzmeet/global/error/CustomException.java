package kr.codesquad.jazzmeet.global.error;

import kr.codesquad.jazzmeet.global.error.statuscode.StatusCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CustomException extends RuntimeException {
	// 현재는 에러 코드만 사용하는 상황.
	private final StatusCode statusCode;

	@Override
	public String toString() {
		return "statusCode= " + statusCode;
	}
}
