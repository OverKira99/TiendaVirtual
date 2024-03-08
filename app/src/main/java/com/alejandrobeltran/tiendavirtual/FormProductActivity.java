package com.alejandrobeltran.tiendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class FormProductActivity extends AppCompatActivity {

    private Button btnSaveForm;
    private TextInputLayout nameTextField, descriptionTextFile,priceTextFile, imageUrlTextFile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_product);
        btnSaveForm = findViewById(R.id.btn_saveProduct_form);
        nameTextField =findViewById(R.id.tf_name_product_form);
        descriptionTextFile = findViewById(R.id.tf_description_product_form);
        priceTextFile = findViewById(R.id.tf_price_product_form);
        imageUrlTextFile = findViewById(R.id.tf_image_url_product_form);
        btnSaveForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo de aca se activa cuando el usuario use el boton
                String name = nameTextField.getEditText().getText().toString().trim();
                String description = descriptionTextFile.getEditText().getText().toString().trim();
                String price = priceTextFile.getEditText().getText().toString().trim();
                String urlImage = imageUrlTextFile.getEditText().getText().toString().trim();

                if(name.isEmpty()){
                    nameTextField.setError("Por Favor Ingrese el Nombre");
                    return;
                }else if(name.length()>20){
                    nameTextField.setError("Se Paso de 20");
                    return;
                }
                if(description.isEmpty()){
                    descriptionTextFile.setError("Por Favor Ingrese el Nombre");
                    return;
                }else if(name.length()>20) {
                    descriptionTextFile.setError("Se Paso de 200");
                    return;
                }
                if(price.isEmpty()){
                    priceTextFile.setError("Por Favor Ingrese el Nombre");
                    return;
                }else if(name.length()>20) {
                    priceTextFile.setError("Se Paso de 20");
                    return;
                }
                if(urlImage.isEmpty()){
                    imageUrlTextFile.setError("Por Favor Ingrese el Nombre");
                    return;
                }else if(name.length()>20) {
                    imageUrlTextFile.setError("Se Paso de 20");
                    return;
                }
                Product myNewProcut = new Product("Computador" , "descripcion" , 5000.0, "no hay");


                Toast.makeText(FormProductActivity.this, "Pulso el boton", Toast.LENGTH_SHORT).show();
            }
        });
    }
}