package sravya.example.com.infinitecycle;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by SRAVYA on 07-03-2018.
 */

public class MyAdapter extends PagerAdapter {
List<Integer> listImages;
Context context;
LayoutInflater layoutInflater;

    public MyAdapter(List<Integer> listImages, Context context) {
        this.listImages = listImages;
        this.context = context;
        layoutInflater=LayoutInflater.from(context);
    }

    public int getCount()
{
    return listImages.size();
}
public boolean isViewFromObject(View view,Object object)
{
    return view.equals(object);
}

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        View view=layoutInflater.inflate(R.layout.cardimage,container,false);
        final ImageView imageView=(ImageView)view.findViewById(R.id.image_id);
        final TextView content=(TextView)view.findViewById(R.id.textid);
        final TextView contact=(TextView)view.findViewById(R.id.contact_text);
        contact.setText(null);
       Bitmap originalBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.event1);
        final Bitmap blurredBitmap = BlurBuilder.blur(context, originalBitmap);

        imageView.setImageResource(listImages.get(position));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==1) {
                    //imageView.setBackground(new BitmapDrawable(context.getResources(), blurredBitmap));
                    imageView.setImageBitmap(blurredBitmap);

                    contact.setText("\nContact\n" + "Sravya:1234567890\n" + "Sravya:1234567890");
                    content.setText("Should Create 10 websites");
                }
                else
                {
                    contact.setText("\nContact2\n" + "Sravya:1234567890\n" + "Sravya:1234567890");
                    content.setText("Should Create 102 websites");

                }

            }
        });
        container.addView(view);
        return view;
    }
}
