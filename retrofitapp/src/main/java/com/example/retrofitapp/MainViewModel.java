package com.example.retrofitapp;
import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.retrofitapp.bean.MainListBean;
import com.example.retrofitapp.network.HttpUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainViewModel extends ViewModel {

    public MutableLiveData<ArouterPath> startAc = new MutableLiveData<ArouterPath>() {

    };

    public void startMyretrofitAc(){
          ArouterPath arouterPath = new ArouterPath();
          arouterPath.setToName(MyRetrofitActivity.class);
          startAc.setValue(arouterPath);
    }

    public MainViewModel() {
         super();
    }

     public void getGson(){
         Map<String, Object> mp = new HashMap<>();
         mp.put("gradeId",0);
         mp.put("subjectId",0);
         HttpUtils.getInstance().doPost("rpHomePage/v1/getHomePageList.shtml", mp, MainListBean.class, new com.example.retrofitapp.network.Callback<MainListBean>() {
             @Override
             public void onResponse(MainListBean response) {
                      Log.e("===",response.toString());
             }

             @Override
             public void onFailure(Throwable e) {

             }
         });
//         RetrofitUtils.getInstance().listRepos().enqueue(new Callback<ResponseBody>() {
//             @Override
//             public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//
//             }
//
//             @Override
//             public void onFailure(Call<ResponseBody> call, Throwable t) {
//
//             }
//         });


//         RetrofitUtils.getInstance().listRepos().enqueue(new Callback<ResponseBody>() {
//             @Override
//             public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                    Log.e("===","name=="+Thread.currentThread().getName()+"content="+response.body().toString());
//             }
//
//             @Override
//             public void onFailure(Call<ResponseBody> call, Throwable t) {
//
//             }
//         });
     }

     public void getTestNet(){
          //retrofit自带的 callAdapter
         Map<String, Object> mp = new HashMap<>();
             mp.put("gradeId",0);
             mp.put("subjectId",0);
//          RetrofitUtils.getInstance().getHomePageList(mp).enqueue(new Callback<HttpResultNew<MainPageBean>>() {
//              @Override
//              public void onResponse(Call<HttpResultNew<MainPageBean>> call, Response<HttpResultNew<MainPageBean>> response) {
//                      Log.e("+++",Thread.currentThread().getName());
//              }
//
//              @Override
//              public void onFailure(Call<HttpResultNew<MainPageBean>> call, Throwable t) {
//
//              }
//          });

         //Rxjava的Rxjava-adapter适配器没有帮我们切换线程
//         RetrofitUtils.getInstance().getHomePageList(mp).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).subscribe(new Observer<HttpResultNew<MainPageBean>>() {
//             @Override
//             public void onSubscribe(Disposable d) {
//
//             }
//
//             @Override
//             public void onNext(HttpResultNew<MainPageBean> value) {
//                  //拿到内容
//                 Log.e("+++",value.getRespObject().toString());
//             }
//
//             @Override
//             public void onError(Throwable e) {
//
//             }
//
//             @Override
//             public void onComplete() {
//
//             }
//         });

         OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
         RequestBody mrequestBody = new FormBody.Builder()  //创建请求体
                 .add("gradeId",0+"")
                 .add("",0+"")
                 .build();
         Request request = new Request.Builder().addHeader("accessToken","16655613634921DDEpMnYrc")
                 .url("https://test.readingpro.cn/readingpro-java/rpHomePage/v1/getHomePageList.shtml")
                 .post(mrequestBody).build(); //创建请求
         Call call = okHttpClient.newCall(request);  //创建一个真正的call对象
         call.enqueue(new Callback() {
             @Override
             public void onFailure(Call call, IOException e) {

             }

             @Override
             public void onResponse(Call call, Response response) throws IOException {
                 Log.e("+++", "onResponse: .="+response);
                 Log.e("+++", "onResponse: .="+response.body().string());
             }
         });



     }




    public final void runWithScissors( Runnable r, long timeout) {

    }




}



