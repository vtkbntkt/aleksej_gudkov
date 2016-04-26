package com.gai.aleksej_gudkov;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.gai.aleksej_gudkov.adapters.ImageRecyclerAdapter;
import com.gai.aleksej_gudkov.data.DataSet;
import com.gai.aleksej_gudkov.utility.HorizontalSpaceItemDecoration;


public class DetailedActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String CARD_ID = "cardId";
    public static final long DEFAULT_CARD_ID = 0;
    private ActionBar actionBar;
    private String[] photoRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        Toolbar mToolbar =
                (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        actionBar = getSupportActionBar();
        if (actionBar != null) actionBar.setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView =
                (RecyclerView) findViewById(R.id.recycler_view);

        LayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        initViews();

        Adapter adapter = new ImageRecyclerAdapter(photoRef);
        recyclerView.setAdapter(adapter);

        int horizontalItemSpace =
                (int) getResources().getDimension(R.dimen.horizontal_item_space);
        recyclerView.addItemDecoration(
                new HorizontalSpaceItemDecoration(horizontalItemSpace));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        CharSequence text = v.getClass().getSimpleName();
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    public void initViews() {
        TextView indexText = (TextView) findViewById(R.id.index);
        TextView statusText = (TextView) findViewById(R.id.status);
        TextView createText = (TextView) findViewById(R.id.created_date);
        TextView regText = (TextView) findViewById(R.id.registered_date);
        TextView deadlineText = (TextView) findViewById(R.id.deadline_date);
        TextView respText = (TextView) findViewById(R.id.responsible_name);
        TextView desText = (TextView) findViewById(R.id.description);

        Intent intent = getIntent();
        long cardId = intent.getLongExtra(CARD_ID, DEFAULT_CARD_ID);
        String actionbarTitle = DataSet.getTitle(cardId);
        actionBar.setTitle(actionbarTitle);
        photoRef = DataSet.getRef(cardId);

        indexText.setText(DataSet.getIndex(cardId));
        statusText.setText(DataSet.getStatus(cardId));
        createText.setText(DataSet.getDateStart(cardId));

        if (DataSet.getDateReg(cardId) != null) {
            regText.setText(DataSet.getDateReg(cardId));
        } else {
            regText.setVisibility(View.INVISIBLE);
        }

        if (DataSet.getDateEnd(cardId) != null) {
            deadlineText.setText(DataSet.getDateEnd(cardId));
        } else {
            deadlineText.setVisibility(View.INVISIBLE);
        }

        if (DataSet.getResp(cardId) != null) {
            respText.setText(DataSet.getResp(cardId));
        } else {
            respText.setVisibility(View.INVISIBLE);
        }

        if (DataSet.getDes(cardId) != null) {
            desText.setText(DataSet.getDes(cardId));
        } else {
            desText.setVisibility(View.INVISIBLE);
        }
    }
}
