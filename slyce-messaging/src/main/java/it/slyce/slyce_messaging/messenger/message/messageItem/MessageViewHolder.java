package it.slyce.slyce_messaging.messenger.message.messageItem;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import it.slyce.slyce_messaging.messenger.utils.CustomSettings;

/**
 * Created by John C. Hunchar on 5/12/16.
 */
public class MessageViewHolder extends RecyclerView.ViewHolder {
    public ImageView avatar;
    public TextView initials;
    public TextView timestamp;
    public ViewGroup avatarContainer;
    public CustomSettings customSettings;

    public MessageViewHolder(View itemView, CustomSettings customSettings) {
        super(itemView);
        this.customSettings = customSettings;
    }
}
