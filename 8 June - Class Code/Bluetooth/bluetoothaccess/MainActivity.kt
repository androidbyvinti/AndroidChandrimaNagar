package com.bmpl.bluetoothaccess

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var bluetoothAdapter : BluetoothAdapter? = null

    lateinit var bluetoothDevice : Set<BluetoothDevice>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter() //Bluetooth Driver Information

        bluetoothSwitch.isChecked = bluetoothAdapter!!.isEnabled

        bluetoothSwitch.setOnCheckedChangeListener { compoundButton, b ->

            if(bluetoothAdapter == null){
                Toast.makeText(this, "Bluetooth is not available on this Device", Toast.LENGTH_LONG).show()
            } else if(!bluetoothAdapter!!.isEnabled){
                // Intent or
                bluetoothAdapter!!.enable()   // request the Bluetooth Driver to Enable Bluetooth
            } else{
                bluetoothAdapter!!.disable()
            }
        }

        visibleButton.setOnClickListener {
            // Intent
            var intent = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
            startActivity(intent)
        }

        pairdDevicesButton.setOnClickListener {
            bluetoothDevice = bluetoothAdapter!!.bondedDevices // [{name, uid, }, {name, uid, }, {name, uid, }, {}]
            var deviceNames  = ArrayList<String>()

            for(b in bluetoothDevice){
                deviceNames.add(b.name)
            }
            var arrayAdapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, deviceNames)

            listView.adapter = arrayAdapter
        }
    }
}