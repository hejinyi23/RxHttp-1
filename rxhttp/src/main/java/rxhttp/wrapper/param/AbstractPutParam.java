package rxhttp.wrapper.param;


import rxhttp.wrapper.utils.BuildUtil;
import io.reactivex.annotations.NonNull;
import okhttp3.Request;

/**
 * Put请求继承本类
 * User: ljx
 * Date: 2019/1/19
 * Time: 11:36
 */
public abstract class AbstractPutParam extends AbstractParam implements PutRequest {

    public AbstractPutParam(@NonNull String url) {
        super(url);
    }

    @Override
    public final Request buildRequest() {
        return BuildUtil.buildPutRequest(this);
    }
}
