package com.angler.anglerandroidgrid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val templateRecyclerView: RecyclerView = findViewById(R.id.templateRecyclerView)

        // Set up GridLayoutManager with 2 columns
        val layoutManager = GridLayoutManager(this, 2)
        templateRecyclerView.layoutManager = layoutManager

        val templates = listOf(
            TemplateData(R.drawable.placeholder_background, R.drawable.angler1, "Partner for Innovation", "A pioneering India-based Internet-solutions company with offices worldwide. Our unique Full Service Provider (FSP) solutions model brings you the best of the worlds of Offshore Software Development, E-Business Products and Interactive Media."),
            TemplateData(R.drawable.placeholder_background, R.drawable.angler2, "Cutting-edge Business Products", "A pioneering India-based Internet-solutions company with offices worldwide. Our unique Full Service Provider (FSP) solutions model brings you the best of the worlds of Offshore Software Development, E-Business Products and Interactive Media."),
            TemplateData(R.drawable.placeholder_background, R.drawable.angler3, "Creative Design Solutions", "A pioneering India-based Internet-solutions company with offices worldwide. Our unique Full Service Provider (FSP) solutions model brings you the best of the worlds of Offshore Software Development, E-Business Products and Interactive Media."),
            TemplateData(R.drawable.placeholder_background, R.drawable.angler4, "Offshore Outsourcing Services", "A pioneering India-based Internet-solutions company with offices worldwide. Our unique Full Service Provider (FSP) solutions model brings you the best of the worlds of Offshore Software Development, E-Business Products and Interactive Media."),
            TemplateData(R.drawable.placeholder_background, R.drawable.angler5, "Web Application Development", "A pioneering India-based Internet-solutions company with offices worldwide. Our unique Full Service Provider (FSP) solutions model brings you the best of the worlds of Offshore Software Development, E-Business Products and Interactive Media."),
            TemplateData(R.drawable.placeholder_background, R.drawable.angler6, "Mobile App Development Services", "A pioneering India-based Internet-solutions company with offices worldwide. Our unique Full Service Provider (FSP) solutions model brings you the best of the worlds of Offshore Software Development, E-Business Products and Interactive Media."),
            TemplateData(R.drawable.placeholder_background, R.drawable.angler7, "Vendora – Vendor Management Software", "A pioneering India-based Internet-solutions company with offices worldwide. Our unique Full Service Provider (FSP) solutions model brings you the best of the worlds of Offshore Software Development, E-Business Products and Interactive Media."),
            TemplateData(R.drawable.placeholder_background, R.drawable.angler8, "TimeCheck – Time and Attendance Software", "A pioneering India-based Internet-solutions company with offices worldwide. Our unique Full Service Provider (FSP) solutions model brings you the best of the worlds of Offshore Software Development, E-Business Products and Interactive Media."),
            TemplateData(R.drawable.placeholder_background, R.drawable.angler9, "TimeCheck – Time and Attendance Software", "A pioneering India-based Internet-solutions company with offices worldwide. Our unique Full Service Provider (FSP) solutions model brings you the best of the worlds of Offshore Software Development, E-Business Products and Interactive Media."),
            TemplateData(R.drawable.placeholder_background, R.drawable.angler10, "Store’n Shipfast – ERP for Logistics", "A pioneering India-based Internet-solutions company with offices worldwide. Our unique Full Service Provider (FSP) solutions model brings you the best of the worlds of Offshore Software Development, E-Business Products and Interactive Media."),
            TemplateData(R.drawable.placeholder_background, R.drawable.angler11, "Aura – Quality Management Software", "A pioneering India-based Internet-solutions company with offices worldwide. Our unique Full Service Provider (FSP) solutions model brings you the best of the worlds of Offshore Software Development, E-Business Products and Interactive Media."),
            TemplateData(R.drawable.placeholder_background, R.drawable.angler12, "iStore – E Commerce Store Front", "A pioneering India-based Internet-solutions company with offices worldwide. Our unique Full Service Provider (FSP) solutions model brings you the best of the worlds of Offshore Software Development, E-Business Products and Interactive Media."),
            // Add more template data as needed
        )

        val adapter = TemplateItemAdapter(templates)
        templateRecyclerView.adapter = adapter
    }
}
