package tutorials.hackro.com.gallery.domain.usecase;

/**
 * Created by hackro on 6/03/17.
 */
public class DefaultSubscriber <T> extends rx.Subscriber<T>{
    @Override
    public void onCompleted() {
    }

    @Override
    public void onError(Throwable e) {
    }

    @Override
    public void onNext(T t) {
    }
}
